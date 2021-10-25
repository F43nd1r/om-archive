
solution {
    puzzle = "P067"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = 2 to -3
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = 0 to -1
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -3 to 10
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -6 to 7
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -1 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to 0
        rotation = -6
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 6
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -3 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 7
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -6
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 3 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -9 to 7
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = 3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to 10
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = -6 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to -7
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(17)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(20)
                grab()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
