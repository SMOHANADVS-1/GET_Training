import React, { Component } from 'react'

export default class StateDemo extends Component {

    //Define state of a Component
    state={
        name:"Rahul", //String name="Rahul"
        age:25,       //int age=25
        num1:100,
        num2:200,
        sum:0
    };
//Arrow Function
    myMethod=() => {
        this.setState({
            name:"Rahul Kumar",
            age:26
        })
    };

 addition=() => {
    this.setState({
        // num1:this.state.num1+100,
        // num2:this.state.num2+100,
        sum:this.state.num1+this.state.num2
    })
 }
  render() {
    return (
      <div>
         <h1>State Management in React Js & Event Binding</h1>
        <h2>The Components Data is Stored in State</h2>
        <h3>Display State - Name : {this.state.name}, Age : {this.state.age}</h3>
        <br></br>
        <button onClick={this.myMethod}>Change State</button><br/>
        
        <h3>The Addition of {this.state.num1} and {this.state.num2} is : {this.state.sum}</h3>
        {this.state.num1+this.state.num2}
        <button onClick={this.addition}>Add</button>
      </div>
    )
  }
}
