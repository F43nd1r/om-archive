
solution {
    puzzle = "P055"
    name = "NO-TRACK"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 3 to -4
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to -1
        rotation = -4
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = -2 to 4
        rotation = -7
        size = 3
    }
    arm(ARM2) {
        number = 4
        position = -5 to 4
        rotation = -7
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 2
        rotation = -13
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -10 to 5
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 4 to 1
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -4
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -4
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = 3 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -12 to 9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -12 to 10
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to -3
        rotation = -10
    }
    glyph(DUPLICATION) {
        position = -6 to 3
        rotation = -9
    }
    glyph(DUPLICATION) {
        position = -7 to 4
        rotation = -12
    }
    glyph(DUPLICATION) {
        position = -6 to 0
        rotation = -20
    }
    glyph(DUPLICATION) {
        position = -13 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -14 to 7
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -8 to 6
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = -5 to 7
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -2 to 8
        rotation = -9
    }
    glyph(DUPLICATION) {
        position = -2 to 6
        rotation = -13
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 5 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(18)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(48)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(98)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
            }
        }
        )
    }
}
