
solution {
    puzzle = "P100"
    name = "OVERLAP CG"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -4 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 0
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 1
        rotation = -1
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = -4 to -1
        positions = listOf(1 to 0, 0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                pivotClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                forward()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                wait(2)
                grab()
                back()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                wait(2)
                grab()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
