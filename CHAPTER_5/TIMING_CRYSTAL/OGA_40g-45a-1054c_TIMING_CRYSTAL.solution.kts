
solution {
    puzzle = "P042"
    name = "OVERLAP GA"
    arm(ARM1) {
        number = 1
        position = -2 to 0
        rotation = 11
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 6
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 3
        rotation = 5
    }
    io(INPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                forward()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        )
    }
}
