
solution {
    puzzle = "P100"
    name = "OCG"
    arm(ARM1) {
        number = 1
        position = 4 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -4
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
        position = 1 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    track {
        position = 4 to -3
        positions = listOf(1 to -1, 0 to 0, -1 to 0)
    }
    track {
        position = 0 to -4
        positions = listOf(0 to 0, 1 to 0, 1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                wait(1)
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
            sequence(1) {
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                back()
                wait(3)
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                wait(3)
                forward()
                pivotCounterClockwise()
                back()
                rotateCounterClockwise()
                reset()
                wait(13)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
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
                wait(4)
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
        )
    }
}
