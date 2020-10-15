
solution {
    puzzle = "P058"
    name = "B X GAX"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 2
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -1
        rotation = 6
    }
    io(INPUT) {
        index = 2
        position = -2 to -1
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                back()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
            }
        }
        )
    }
}
