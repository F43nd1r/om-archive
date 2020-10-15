
solution {
    puzzle = "P038"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = 4 to 0
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 1 to 3
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = 4 to 2
        rotation = 0
    }
    track {
        position = 3 to 1
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                pivotClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                reset()
            }
        }
        )
    }
}
