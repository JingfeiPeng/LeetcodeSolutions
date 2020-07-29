interface Pet{
    name:string
}

interface Weapon{
    damage: number
}

interface tool{
    usedby: string[]
}

let pet:Pet = {
    name: "Pet"
}

let weapon:Weapon = {
    damage: 25
}

let tool: tool = {
    usedby: ['a','b']
}

// <A> here just creates a generic type A, and it can be used in the function like a regular type
function func<A>(arg:A):A{
    return arg
}

let ok:Pet = func(weapon)

console.log(typeof(ok))
