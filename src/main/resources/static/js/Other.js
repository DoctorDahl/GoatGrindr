// Make the button Make Admin dynamic so it toggles between 'Make Admin' and 'Remove Admin'
function toggleAdminRole() {
    var elem = document.getElementById("btn");
    if (elem.value === 'Make Admin') {
        elem.value = 'Remove Admin';
    } else {
        elem.value = 'Make Admin';
    }
}