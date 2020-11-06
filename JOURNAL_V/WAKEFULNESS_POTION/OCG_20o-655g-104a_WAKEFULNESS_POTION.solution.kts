
solution {
    puzzle = "P088"
    name = "OVERLAP G"
    arm(ARM1) {
        number = 1
        position = -1 to 3
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -8 to 5
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 2
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -7 to 4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to 4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to 2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -6 to 6
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -2 to 2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -2 to 2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 0 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 1 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = -1
    }
    track {
        position = 2 to -2
        positions = listOf(3 to -1, 2 to -1, 1 to -1, 0 to 0, 0 to 1)
    }
    track {
        position = -1 to 3
        positions = listOf(0 to 0, 0 to 1, 0 to 2, 1 to 2, 1 to 1)
    }
    track {
        position = -8 to 4
        positions = listOf(0 to 1, 1 to 0, 2 to -1, 2 to 0, 3 to -1)
    }
    track {
        position = 3 to -4
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                wait(1)
                forward()
                forward()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                forward()
                back()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                forward()
                grab()
                back()
                forward()
                wait(2)
                pivotClockwise()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                forward()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                back()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                forward()
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
            }
        }
        )
    }
}
