
solution {
    puzzle = "w2450512021"
    name = "OVERLAP CG"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to 1
        rotation = -1
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
        position = -4 to 5
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -7 to 5
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -5 to -1
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 2
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
        position = -4 to 3
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -5 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to 4
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
        position = -2 to 3
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -4 to 1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -5 to 3
        rotation = 4
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
        positions = listOf(0 to 1, 0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = 2 to -1
        positions = listOf(-2 to 0, -1 to 0, -1 to -1, 0 to -1, 0 to 0, -1 to 1, -2 to 2)
    }
    track {
        position = -5 to 1
        positions = listOf(0 to 0, 0 to -1, 0 to -2)
    }
    track {
        position = -4 to 4
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                back()
                back()
                rotateCounterClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                back()
                back()
                wait(1)
                back()
                pivotClockwise()
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
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                back()
                back()
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
                back()
                drop()
            }
        }
        )
    }
}
