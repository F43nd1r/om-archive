
solution {
    puzzle = "P102"
    name = "B TI46A 1-3T"
    arm(ARM2) {
        number = 1
        position = -5 to 3
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -6 to 7
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -7 to 3
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -3 to -2
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -2 to -2
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -1 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -3 to 4
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = 0 to -3
        rotation = 0
        size = 2
    }
    arm(ARM2) {
        number = 9
        position = 1 to -2
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 10
        position = -2 to 3
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 8 to -6
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -7 to 7
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -6 to 6
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 0
        rotation = 6
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -6
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -7 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 5 to -2
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(7)
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
                wait(16)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(14)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(14)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(12)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(21)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
