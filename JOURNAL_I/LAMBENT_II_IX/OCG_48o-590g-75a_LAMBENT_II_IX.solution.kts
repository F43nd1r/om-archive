
solution {
    puzzle = "P058"
    name = "OVERLAP G"
    arm(ARM1) {
        number = 1
        position = -3 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 3 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 4 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to 1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to -2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 5 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -1
        rotation = 0
    }
    track {
        position = 0 to -5
        positions = listOf(-1 to 2, -2 to 2, -2 to 1, -1 to 1, 0 to 0, 0 to 1)
    }
    track {
        position = 2 to -3
        positions = listOf(2 to -2, 3 to -2, 3 to -1, 2 to 0, 1 to 1, 1 to 0, 0 to 0, 1 to -1)
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -2 to 2, -2 to 3, -3 to 3)
    }
    track {
        position = 1 to 2
        positions = listOf(1 to -3, 0 to -2, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                reset()
                wait(2)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                reset()
                wait(2)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                back()
                grab()
                back()
                rotateClockwise()
                wait(2)
                back()
                back()
                back()
                pivotCounterClockwise()
                back()
                back()
                reset()
                wait(3)
                back()
                grab()
                back()
                rotateClockwise()
                forward()
                back()
                back()
                back()
                back()
                pivotCounterClockwise()
                back()
                back()
                reset()
                wait(3)
                back()
                grab()
                back()
                rotateClockwise()
                forward()
                back()
                back()
                back()
                back()
                pivotCounterClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                wait(4)
                back()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(27)
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                back()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(26)
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                wait(3)
                grab()
                forward()
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                back()
                back()
                back()
                back()
                pivotCounterClockwise()
                back()
                back()
                reset()
                wait(3)
                grab()
                back()
                rotateClockwise()
                forward()
                back()
                back()
                back()
                back()
                pivotCounterClockwise()
                back()
                back()
                reset()
                wait(4)
                grab()
                back()
                rotateClockwise()
                forward()
                back()
                back()
                back()
                back()
                pivotCounterClockwise()
                back()
                back()
                reset()
            }
        }
        )
    }
}
