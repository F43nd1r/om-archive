
solution {
    puzzle = "P102"
    name = "B TI47 1-3T"
    arm(ARM2) {
        number = 1
        position = -3 to -2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -6 to 1
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -3 to -4
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 2 to -5
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 2 to -4
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -3 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -4 to 1
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = 3 to -3
        rotation = 1
        size = 2
    }
    arm(ARM2) {
        number = 9
        position = 2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 10
        position = -3 to 1
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 6 to 2
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -7 to 1
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 0 to -5
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to -3
        rotation = 7
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -3
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -5 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -3 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 2 to 3
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(9)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(18)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(16)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(13)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(23)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(14)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(16)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(16)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(5)
                extendTape()
            }
        }
        )
    }
}
