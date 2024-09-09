
const person = {
  name: 'Maddy',
  age: 22,
  introduce: () => console.log('Hi my name is Maddy and I am 22 years old'),
}

function createPerson(name, age) {
  const person = {
    name,
    age,
    introduce: () => console.log(`Hi, my name is ${name} and I am ${age} years old`),
  };

  return person;
}
