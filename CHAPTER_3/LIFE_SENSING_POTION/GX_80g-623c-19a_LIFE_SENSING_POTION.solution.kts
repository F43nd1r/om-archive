
solution {
    puzzle = "P030b"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = -2 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to -2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 1
        rotation = 6
    }
    track {
        position = -2 to -2
        positions = listOf(0 to 0, 0 to 1, -1 to 1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateClockwise()
                back()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                reset()
                grab()
                forward()
                rotateClockwise()
                back()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                reset()
                grab()
                forward()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
