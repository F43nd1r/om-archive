
solution {
    puzzle = "P100"
    name = "OVERLAP GX"
    arm(ARM1) {
        number = 1
        position = 4 to -3
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = -3
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 1
    }
    track {
        position = 4 to -2
        positions = listOf(0 to -1, 1 to -1, 1 to -2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                back()
                forward()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                forward()
                pivotCounterClockwise()
                wait(1)
                back()
                back()
                rotateCounterClockwise()
                reset()
                wait(14)
                extendTape()
            }
        }
        )
    }
}
