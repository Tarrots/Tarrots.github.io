/*
- Cách tạo một Component cơ bản
- Bắt buột phải có hàm render()
*/
class Tarrots extends React.Component {
    // create state
    constructor(state) {
        super(state);
        this.state = {
          val: this.props.val
        };
        this.shows = this.shows.bind(this);
      }

    // functions
    shows(){
        alert(this.props.children);
    }
    // create render
    render() {
      return (
        <div className="container">
        {/** 
        - props và state trong Component
        - Bắt sự kiện onclick, ..
        */}
            <h1 className={this.props.styl}>{this.props.name} - {this.props.children}</h1>
            <p>{this.state.val}</p>
            <button onClick={this.shows}>Thông tin</button>
            {/* <Acount /> // Component inside Component*/}
        </div>
      );
    }
}
class Acount extends React.Component{
    render(){
        return(
            <h3>Thanh Phong</h3>
        );
    }   
}
/*
- Nhập liệu với Component
- input, select option, ...
*/
class InpTag extends React.Component{
    constructor(val){   
        super(val);
        this.show = this.show.bind(this);
    }
    
    show(){
        var text = this.sl.value;
        alert(text);
      }
      render(){
        return(
          <div>
            {/* select option*/}
            <select ref={(select) => { this.sl = select; }}>
                <option value="a">AA</option>
                <option value="b">BB</option>
                <option value="c">CC</option>
            </select>
            {/* input button*/}
            <input type="text" ref={(input) => { this.txt = input; }}/>
            <button onClick={this.show}>Hiển thị</button>
          </div>
        );
      };
}
/**
 * Render code về cho file homepage
 * Nhiều Component thì nên bao lại bằng thẻ div
 */
ReactDOM.render(
<div>   
    {/* <Tarrots name="React Js" styl="aqua" val="10">Thanh Phong</Tarrots> 
    <Tarrots name="Node Js" styl="brown" val="20">Tarrots</Tarrots> 
    */}
    <InpTag/>
</div>, document.getElementById('root')); 