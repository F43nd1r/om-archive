
solution {
    puzzle = "P089"
    name = "TIC"
    arm(ARM6) {
        number = 1
        position = -3 to 2
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -7 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -9 to 7
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -7 to 6
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -8 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to 5
        rotation = 1
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 7 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 9
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 11
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 10
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 4 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 12
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 11
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 11
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -5 to 7
        rotation = -3
    }
    glyph(DUPLICATION) {
        position = -4 to 9
        rotation = 11
    }
    glyph(DUPLICATION) {
        position = -6 to 10
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -6 to 11
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 1 to 11
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -4 to 8
        rotation = 9
    }
    glyph(DUPLICATION) {
        position = 4 to 4
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 4 to 7
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 2 to 9
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 10
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -8 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 13
    }
    io(INPUT) {
        index = 1
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -7 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
