
solution {
    puzzle = "P098"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -13 to -3
        rotation = 4
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -13 to 2
        rotation = 5
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = -18 to 3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -16 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -9 to -2
        rotation = 7
        size = 2
    }
    glyph(BONDER) {
        position = -16 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = -16 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = -15 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -14 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -13 to -5
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -16 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -12 to -6
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -12 to -7
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -11 to -5
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -9 to -6
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -7 to -5
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to -6
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -6 to -7
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -4 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -13 to 1
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = -18 to 2
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -10 to -3
        rotation = -8
    }
    io(OUTPUT) {
        index = 0
        position = -8 to 1
        rotation = 8
    }
    io(INPUT) {
        index = 1
        position = -19 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                wait(15)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(17)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(17)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
