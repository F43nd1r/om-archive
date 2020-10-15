
solution {
    puzzle = "P089"
    name = "B X GAX 1"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 1 to -4
        rotation = 0
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                pivotClockwise()
                back()
                reset()
            }
        }
        )
    }
}
