window.addEventListener("load", () => {
  fetchData();
});

const fetchData = () => {
  fetch("https://dummyjson.com/users")
    .then((response) => response.json())
    .then((data) => {
      console.log(data.users[0].firstName);
      data.users.forEach((user) => {
        createCard(user);
      });
    })
    .catch((error) => {
      console.log(error);
    });
};

// createElement(), appendChild()
const createCard = (user) => {
  let card = document.createElement("div");
  let user_name = document.createElement("h3");
  let btn = document.createElement("button");

  // add css
  card.classList.add("card");
  user_name.classList.add("user-name");
  btn.classList.add("btn");

  // add contents - data
  user_name.innerText = user.firstName + " " + user.lastName;
  btn.innerText = "View Details";

  // add child -> parent
  card.appendChild(user_name);
  card.appendChild(btn);

  // card -> container
  document.getElementById("main").appendChild(card);

  // add event
  btn.addEventListener("click", () => {
    document.getElementById("model").classList.remove("hide");
    document.getElementById("model").classList.add("show");

    document.getElementById("dummy").innerText = user.age;
  });
};

document.getElementById("btn").addEventListener("click", () => {
  document.getElementById("model").classList.remove("show");
  document.getElementById("model").classList.add("hide");
});
