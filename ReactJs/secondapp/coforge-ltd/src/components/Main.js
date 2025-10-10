import React, { Component } from 'react'

export default class Main extends Component {
  render() {
    return (
       <div style={{
                justifyContent: 'Center',
                alignItems: 'Right',
                height: '100vh',
                color:'white',
                backgroundColor:'crimson'
              }}>
                <h1>Welcome to Wells Fargo</h1>
                <br></br>
                <img src={'https://th.bing.com/th/id/OIP.WPpt1g0ttniN_MM8OlfPDQHaFj?w=233&h=180&c=7&r=0&o=7&cb=12&pid=1.7&rm=3'}
                height={'400px'} width={'600px'} alt={'COFORGE'}/>

                <h2>{20+40}</h2>
            </div>

    )
  }
}

