
solution {
    puzzle = "P089"
    name = "OGC"
    arm(ARM1) {
        number = 1
        position = 3 to -1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 4
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -1
        rotation = 0
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
            }
        }
        )
    }
}
