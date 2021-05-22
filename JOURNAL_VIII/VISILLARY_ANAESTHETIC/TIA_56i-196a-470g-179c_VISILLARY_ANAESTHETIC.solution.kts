
solution {
    puzzle = "P102"
    name = "NEW SOLUTION 5"
    arm(ARM1) {
        number = 1
        position = 0 to -3
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -7 to 3
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -3 to -2
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -2 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -5 to 3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 1 to -2
        rotation = 2
        size = 1
    }
    arm(ARM2) {
        number = 9
        position = -4 to 6
        rotation = 2
        size = 3
    }
    arm(ARM3) {
        number = 10
        position = -3 to 5
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 11
        position = -3 to 6
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 12
        position = 8 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = 6 to 3
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 7
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 6 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 7 to 0
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 0
        rotation = 12
    }
    io(INPUT) {
        index = 0
        position = -6 to 5
        rotation = 6
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 2
        rotation = 5
    }
    io(INPUT) {
        index = 1
        position = -4 to 3
        rotation = 6
    }
    io(OUTPUT) {
        index = 1
        position = 10 to -3
        rotation = 5
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(7)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(7)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(7)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(12) {
                wait(14)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(16)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
