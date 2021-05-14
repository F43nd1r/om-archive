
solution {
    puzzle = "P033"
    name = "OG"
    arm(ARM1) {
        number = 1
        position = -2 to 2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 7
    }
    glyph(PURIFICATION) {
        position = -1 to 1
        rotation = 3
    }
    io(INFINITE) {
        index = 0
        position = -14 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
