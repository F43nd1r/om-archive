
solution {
    puzzle = "P061"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = 2 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 5 to 4
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 7 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = 9 to 2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 5 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 8 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 9 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 11 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 11 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 10 to 6
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 6 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 8 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 10 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 10 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to 3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 13 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
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
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(44)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
