import React from 'react'

export default function Profile() {

     const user = {
        name: 'Hedy Lamarr',
        imageUrl: 'https://th.bing.com/th/id/OIP._B1xUr7WzFHVL3j0JCLi4wHaJs?w=191&h=251&c=7&r=0&o=7&cb=12&pid=1.7&rm=3',
        imageSize: 90,
        city: 'California'
      };

      const person = {
        name: 'Gregorio Y. Zara',
        theme: {
          backgroundColor: 'black',
          color: 'pink',
        
        }
      };
  return (
      <>
    <div>
         <h1>{user.name} from {user.city}</h1>
      <img
        className="avatar"
        src={user.imageUrl}
        alt={'Photo of ' + user.name}
        style={{
          width: user.imageSize,
          height: user.imageSize
        }}
      />

    </div>

    <div style={person.theme}>
    <h1>{person.name}'s Todos</h1>
    <img
      className="avatar"
      src="/images/zara.webp"
      alt="Gregorio Y. Zara"
    />
    <ul>
      <li>Improve the videophone</li>
      <li>Prepare aeronautics lectures</li>
      <li>Work on the alcohol-fuelled engine</li>
    </ul>
  </div>
  </>
  )
}
