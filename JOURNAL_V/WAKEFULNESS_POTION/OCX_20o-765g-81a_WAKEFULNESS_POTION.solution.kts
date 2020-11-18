
solution {
    puzzle = "P088"
    name = "OVERLAP X"
    arm(ARM1) {
        number = 1
        position = -1 to 3
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 6
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 5 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
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
        position = -7 to 4
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 5
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 4
        rotation = 3
    }
    glyph(BONDER) {
        position = -5 to 7
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to 2
        rotation = 4
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
        position = -6 to 6
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
        position = -6 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 5
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -4 to 7
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to 7
        rotation = -2
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
        position = -8 to 4
        positions = listOf(0 to 1, 1 to 0, 2 to -1, 2 to 0, 3 to -1)
    }
    track {
        position = 4 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 3 to -4
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -1 to 3)
    }
    track {
        position = -1 to 3
        positions = listOf(0 to 0, 0 to 1, 0 to 2, 1 to 1)
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
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
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
                wait(5)
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                forward()
                grab()
                back()
                wait(2)
                forward()
                pivotClockwise()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                wait(3)
                pivotCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
            }
        }
        )
    }
}
