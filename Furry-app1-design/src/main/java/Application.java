/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Simon Furry
 */

public class Application {
/*
Hold at least 256 unique To-Do lists
Each list shall have a title at least 3 characters long
List can store 256 unique items, include description and "due date" in y-m-d format
Ability to add new To-Do list
Ability to delete an existing To-Do list
ability to edit title and contents of existing to-do list
ability to mark To-Do list as complete
display all existing items in a to-do list
display only complete or incomplete items
save list to storage (Let user select location and name for saved data
ability to load previously saved To-Do data
 */

    public static void main(String[] args){
        createToDo();
        deleteToDo();
        editToDo();
        saveToDo();
    }

    private static void createToDo(){
        /*
        access GUI "Create New To-Do List" button and run
        corresponding code to generate a new file with input user conditions
         */
    }
    private static void deleteToDo(){
        /*
        access GUI "Delete existing To-Do List"
        run code to access file and delete it from folder
         */
    }
    private static void editToDo(){
        /*
        access GUI "Edit existing To-Do List" run code to
        access file name and edit name/contents
         */
    }
    private static void saveToDo(){
        /*
        access GUI option to "Save To-Do list" inside creating to do list
        allow user to path where to save data.
         */
    }
}
