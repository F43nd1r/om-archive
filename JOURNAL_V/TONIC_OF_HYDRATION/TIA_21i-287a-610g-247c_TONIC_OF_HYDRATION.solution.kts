
solution {
    puzzle = "P089"
    name = "TI  21"
    arm(ARM6) {
        number = 1
        position = -3 to 10
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -7 to 9
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -8 to 15
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 3 to 7
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -4 to 16
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 5 to -3
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = -6 to 9
        rotation = 1
    }
    glyph(BONDER) {
        position = -7 to 13
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 14
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 14
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -3 to 13
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 14
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 10
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to 12
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = 8 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 8 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to 8
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to 9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 10 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 9 to 6
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = 10 to 5
        rotation = 7
    }
    glyph(DUPLICATION) {
        position = 7 to 7
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 6 to 7
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = 8 to 8
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 8 to 9
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 6 to 3
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = 7 to 1
        rotation = 8
    }
    glyph(DUPLICATION) {
        position = 9 to 0
        rotation = 7
    }
    glyph(DUPLICATION) {
        position = 10 to 1
        rotation = 10
    }
    glyph(DUPLICATION) {
        position = 9 to 3
        rotation = 9
    }
    glyph(DUPLICATION) {
        position = 7 to 4
        rotation = 12
    }
    io(INPUT) {
        index = 0
        position = -6 to 8
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 13
    }
    io(INPUT) {
        index = 1
        position = -3 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -8 to 14
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
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
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
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
            sequence(6) {
                wait(10)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
