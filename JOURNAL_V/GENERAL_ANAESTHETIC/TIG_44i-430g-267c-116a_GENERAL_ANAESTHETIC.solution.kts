
solution {
    puzzle = "P086"
    name = "B TI44 1-6T"
    arm(ARM6) {
        number = 1
        position = -4 to -3
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 4 to 0
        rotation = -5
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = -4 to -5
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 4
        position = 6 to 0
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -6 to -2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 5 to -2
        rotation = -6
        size = 1
    }
    arm(ARM2) {
        number = 7
        position = -6 to 0
        rotation = -2
        size = 2
    }
    arm(ARM2) {
        number = 8
        position = 3 to -2
        rotation = -6
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -1 to -3
        rotation = -4
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = 1 to -2
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 0 to -2
        rotation = -5
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = -3
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -5
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = -6
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -6
    }
    glyph(ANIMISMUS) {
        position = -5 to -3
        rotation = -2
    }
    glyph(ANIMISMUS) {
        position = 6 to -1
        rotation = -9
    }
    io(INPUT) {
        index = 0
        position = -5 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = -7
    }
    io(INPUT) {
        index = 1
        position = 4 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateCounterClockwise()
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
            sequence(9) {
                wait(8)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(6)
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(53)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
