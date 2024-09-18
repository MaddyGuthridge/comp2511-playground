
const person = {
  name: 'Maddy',
  age: 22,
  introduce: () => console.log('Hi my name is Maddy and I am 22 years old'),
  friends: ['Izy'],
}

function createPerson(name, age) {
  const friendsArray = [];
  const person = {
    name,
    age,
    introduce: () => console.log(`Hi, my name is ${name} and I am ${age} years old`),
    friends: friendsArray,
    addFriend: (friendName) => friendsArray.push(friendName),
  };

  return person;
}

const maddy = createPerson('Maddy', 22);
const keagan = createPerson('Keagan', 18);
const hadheedSiyan = createPerson('Hadheed Siyan', 21);
hadheedSiyan.addFriend('Maddy');


maddy.age = 201934;
