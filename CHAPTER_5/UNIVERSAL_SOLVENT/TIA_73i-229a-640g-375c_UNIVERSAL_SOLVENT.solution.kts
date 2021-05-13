
solution {
    puzzle = "P043"
    name = "NEW SOLUTION 4"
    arm(ARM6) {
        number = 1
        position = -8 to 3
        rotation = 0
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -12 to 7
        rotation = 6
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = -6 to 4
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -3 to 3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -4 to -1
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -6 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -3 to 0
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -3 to -4
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -5 to -4
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -4 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -2 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -3 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -4 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = -6 to -3
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 15
        position = -7 to 3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = -13 to 5
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = -13 to -2
        rotation = -5
        size = 3
    }
    arm(ARM6) {
        number = 18
        position = -14 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 19
        position = -14 to -2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -14 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -12 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -10 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -12 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -11 to -6
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -14 to -4
        rotation = -8
    }
    glyph(DUPLICATION) {
        position = -11 to 6
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -5 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -5 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 11 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 14 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 15 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -17 to -2
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -10 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -15 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = -4 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(11) {
        
            }
        }
        , 
        {
            sequence(12) {
                wait(12)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(14) {
                wait(12)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(13) {
                wait(12)
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(15) {
                wait(12)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(10) {
                wait(12)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(16) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(18) {
                wait(80)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(17) {
                wait(4)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(19) {
                wait(82)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
