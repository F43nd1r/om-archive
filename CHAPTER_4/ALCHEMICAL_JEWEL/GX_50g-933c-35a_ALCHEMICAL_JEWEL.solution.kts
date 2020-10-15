
solution {
    puzzle = "P035"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -6
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
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
        position = -6 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 3
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -3 to -1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                forward()
                back()
                pivotClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                forward()
                back()
                pivotClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                forward()
                back()
                drop()
                forward()
                grab()
                back()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
