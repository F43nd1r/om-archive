
solution {
    puzzle = "P059"
    name = "NO-TRACK"
    arm(ARM1) {
        number = 1
        position = 8 to -3
        rotation = -10
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = 8 to 2
        rotation = -4
        size = 3
    }
    arm(ARM3) {
        number = 3
        position = 8 to 1
        rotation = -4
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = 9 to -1
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 5 to -5
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 14 to -7
        rotation = -10
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -5
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -7
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -9
    }
    glyph(MULTI_BONDER) {
        position = 6 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = -5
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = -10
    }
    glyph(CALCIFICATION) {
        position = 11 to -10
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 12 to -10
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 11 to -6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 8 to -1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 5 to -2
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 1 to -5
        rotation = -3
    }
    glyph(DUPLICATION) {
        position = 0 to -6
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = 6 to -11
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 5 to -11
        rotation = -10
    }
    glyph(DUPLICATION) {
        position = 10 to -11
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = 10 to -5
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 12 to -9
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = 11 to -8
        rotation = -10
    }
    glyph(DUPLICATION) {
        position = 16 to -11
        rotation = -13
    }
    glyph(DUPLICATION) {
        position = 16 to -10
        rotation = -17
    }
    io(INPUT) {
        index = 0
        position = 5 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 18 to -9
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = 5 to 5
        rotation = -9
    }
    io(INPUT) {
        index = 2
        position = 6 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
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
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(28)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(50)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
