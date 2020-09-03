function displayAlcoholBrands(){
    console.log("A")
    const req = new XMLHttpRequest();
    req.onreadystatechange = () => {
        // Example handle logic
        console.log("D")
        if (req.status === 200 && req.readyState === 4) {
            if (req.getResponseHeader("Content-Type") === "application/json") {
                console.log("oh look its some JSON: " + req.responseText);
                //adding an element to the body example
                /*let elem = document.createElement('div');
                elem.textContent = "hello world";
                document.body.appendChild(elem);*/

                let stuff = JSON.parse(req.response);
                stuff.forEach(el => {
                    // console.log(el); // prints whole element
                    // console.log(el.name); // allows access to specific value
                    let bottles = el.bottles;
                    console.log("Bottles",bottles);
                    // adding title to the body of the page
                    let elem = document.createElement('div');
                    let header = document.createElement('h1');
                    header.textContent = "Alcohol Brand Name: " + el.name;
                    elem.appendChild(header);
                    console.log(el);
                    el.bottles.forEach(bottle => {
                        console.log(bottle) // print all notes for each notebook
                        let title = document.createElement('p');
                        title.textContent = "Bottle: " + bottle.name;
                        elem.appendChild(title);
                    })
                    document.body.appendChild(elem);
                });

            } else {
                console.log(
                    "Looks like its not JSON but lets see what it is... " + req.responseText
                );
            }
        } else {
            console.log("Oh no... handle error");
        }
    };
    console.log("B")
    req.open("GET", "http://localhost:8080/get_brands");
    console.log("C")
    req.send();

}

function submitBrand(){
    let elements = document.getElementById("form_input_data").elements;
    console.log(elements);
    let obj ={};
    console.log("FOR LOOP BEFORE", obj)
    for(let i = 0 ; i < elements.length; i++){
        let item = elements.item(i);
        obj[item.name] = item.value;
        console.log("FOR LOOP item", item.value)
    }
    console.log("FOR LOOP AFTER", obj)

    console.log(obj)
    const req = new XMLHttpRequest();
    req.open("POST", "http://localhost:8080/create_brand");
    req.onload = () => {
        if (req.status === 200 && req.readyState == 4) {
            console.log("Server Responded with: " + req.responseText);
        } else {
            console.log("Oops...");
        }
    };
    req.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    req.send(JSON.stringify({name: obj.name}));
}