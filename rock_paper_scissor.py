# Created by : Sidney Kang
# Created on : 10 Oct. 2017
# Created for : ICS3UR
# Daily Assignment - Unit3-03
# This program 

import ui

from numpy import random

def rock_touch_up_inside(sender):
    #This checks the number of students entered versus the constant (25 stuents)

    computer_choice = random.randint(1,3)
    
    #process
    if computer_choice == 1:
       #output
       view['computers_choice_label'].text = "Rock"
       view['who_won_label'].text = "It's a tie"
    elif computer_choice == 2:
       view['computers_choice_label'].text = "Paper" 
       view['who_won_label'].text = "You lost!"
    elif computer_choice == 3:
    	 view['computers_choice_label'].text = "Scissor"
    	 view['who_won_label'].text = "You won!"

def paper_touch_up_inside(sender):
    #This checks the number of students entered versus the constant (25 stuents)
    
    computer_choice = random.randint(1,3)
    
    #process
    if computer_choice == 1:
       #output
       view['computers_choice_label'].text = "Rock"
       view['who_won_label'].text = "You won!"
    elif computer_choice == 2:
       view['computers_choice_label'].text = "Paper" 
       view['who_won_label'].text = "It's a tie"
    elif computer_choice == 3:
    	 view['computers_choice_label'].text = "Scissor"
    	 view['who_won_label'].text = "You lost!"

def scissor_touch_up_inside(sender):
    #This checks the number of students entered versus the constant (25 stuents)

    computer_choice = random.randint(1,3)
    
    #process
    if computer_choice == 1:
       #output
       view['computers_choice_label'].text = "Rock"
       view['who_won_label'].text = "You lost!"
    elif computer_choice == 2:
       view['computers_choice_label'].text = "Paper" 
       view['who_won_label'].text = "You won!"
    elif computer_choice == 3:
    	 view['computers_choice_label'].text = "Scissor"
    	 view['who_won_label'].text = "It's a tie"

view = ui.load_view()
view.present('sheet')
