
solution {
    puzzle = "P026"
    name = "NO-TRACK I-"
    arm(ARM6) {
        number = 1
        position = -9 to 2
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -12 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -10 to -2
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -13 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -10 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -12 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -11 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -8 to 2
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -13 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -8 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -10 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        )
    }
}
