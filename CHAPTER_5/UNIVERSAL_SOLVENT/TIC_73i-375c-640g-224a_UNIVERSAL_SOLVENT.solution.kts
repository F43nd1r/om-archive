
solution {
    puzzle = "P043"
    name = "NEW SOLUTION 4"
    arm(ARM6) {
        number = 1
        position = 1 to 1
        rotation = 0
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -3 to 5
        rotation = 6
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = 3 to 2
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 6 to 1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 5 to -3
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 3 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 6 to -2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 6 to -6
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 4 to -6
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 5 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 7 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 6 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 5 to -4
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 3 to -5
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 15
        position = 2 to 1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = -4 to 3
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = -4 to -4
        rotation = -5
        size = 3
    }
    arm(ARM6) {
        number = 18
        position = -5 to -3
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 19
        position = -5 to -4
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -5 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -8
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -5 to -6
        rotation = -8
    }
    glyph(DUPLICATION) {
        position = -2 to 4
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 4 to -5
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -4
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 5 to -6
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
