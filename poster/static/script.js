

document.addEventListener("DOMContentLoaded", function () {

    const posterMaterialInput = document.getElementsByName("material")[0];
    const posterColorInput = document.getElementsByName("color")[0];
    const posterNameInput = document.getElementsByName("name")[0];
    const poster = document.querySelector("poster");


    poster.addEventListener("submit", function (event) {
        if (materialInput.value.trim() === "") {
            alert("Material cannot be empty!");
            event.preventDefault();
            return;
        }
        if (posterNameInput.length <= 0) {
            alert("Name is invalid");
            event.preventDefault();
            return;
        }


    });
});
