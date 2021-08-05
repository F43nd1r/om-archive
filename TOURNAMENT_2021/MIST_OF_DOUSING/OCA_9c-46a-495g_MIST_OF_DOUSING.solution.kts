
solution {
    puzzle = "w2450512021"
    name = "OVERLAP CAX"
    arm(ARM1) {
        number = 1
        position = -4 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = 2
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = -2 to 4
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -7 to 3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -7 to 5
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -7 to 6
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -5 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -3 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to 0
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -2 to 2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -3 to 1
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -4 to 1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -5 to 3
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -2 to 3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = 3
    }
    track {
        position = -6 to 1
        positions = listOf(-1 to 2, -1 to 1, 0 to 1, 0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = 2 to -1
        positions = listOf(-2 to 0, -1 to 0, -1 to -1, 0 to -1, 0 to 0, -1 to 1, -2 to 2)
    }
    track {
        position = -4 to 3
        positions = listOf(0 to 0, -1 to 1, -2 to 2, -3 to 3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                reset()
                wait(11)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                pivotClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                rotateClockwise()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                back()
                back()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
