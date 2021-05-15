
solution {
    puzzle = "P058"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = -4 to 3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to 0
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = 0 to 5
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -7 to 9
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = 2 to 9
        rotation = -1
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = -2 to 15
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 7
        position = 6 to 11
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 4
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 6
        rotation = -2
    }
    glyph(BONDER) {
        position = 0 to 9
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 8
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 10
        rotation = 4
    }
    glyph(MULTI_BONDER) {
        position = -1 to 19
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 5 to 16
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 20
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 18
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 9 to 13
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 11 to 12
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to 11
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to 19
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 18
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 11 to 8
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 12 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to 15
        rotation = -19
    }
    io(INPUT) {
        index = 1
        position = 3 to 8
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 6 to 7
        rotation = -19
    }
    io(INPUT) {
        index = 2
        position = -5 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
