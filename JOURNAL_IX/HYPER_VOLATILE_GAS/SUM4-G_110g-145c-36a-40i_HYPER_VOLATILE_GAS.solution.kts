
solution {
    puzzle = "P106"
    name = "MOUNTAIN BIKE"
    arm(ARM1) {
        number = 1
        position = 1 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 3
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -2 to 2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                wait(1)
                grab()
                wait(1)
                back()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                back()
                grab()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateClockwise()
                forward()
                forward()
            }
        }
        )
    }
}
