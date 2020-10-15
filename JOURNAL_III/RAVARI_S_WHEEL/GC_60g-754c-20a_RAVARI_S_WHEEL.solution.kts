
solution {
    puzzle = "P064"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 3
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 1
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
