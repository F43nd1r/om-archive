
solution {
    puzzle = "w2501727889"
    name = "B TI31G 1-48T"
    arm(ARM6) {
        number = 1
        position = 1 to -3
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 1
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 6 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 2 to 18
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -4 to 4
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 12
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 6
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 8
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 4 to -1
        rotation = -2
    }
    glyph(ANIMISMUS) {
        position = -1 to 0
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -28 to 8
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -4
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -29 to 8
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(3071)
                grab()
                pivotCounterClockwise()
            }
        }
        )
    }
}
