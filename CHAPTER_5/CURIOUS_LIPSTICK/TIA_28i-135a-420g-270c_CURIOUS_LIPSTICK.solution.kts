
solution {
    puzzle = "P041"
    name = "NEW SOLUTION 2"
    arm(ARM6) {
        number = 1
        position = -5 to 1
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -4 to 0
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -5 to 2
        rotation = -2
        size = 2
    }
    arm(ARM2) {
        number = 4
        position = -4 to -3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -13 to -4
        rotation = 1
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 6
        position = -15 to -5
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -13 to -2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -11 to -1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -5 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -8 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -12 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -12 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -14 to -5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -10 to -4
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -9 to -5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -8 to -4
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -8 to -3
        rotation = -4
    }
    glyph(ANIMISMUS) {
        position = -5 to -1
        rotation = -6
    }
    glyph(DISPOSAL) {
        position = -7 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -10 to 2
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = -14 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(15)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(15)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
