
solution {
    puzzle = "w2450512626"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to -3
        rotation = -2
    }
    glyph(UNIFICATION) {
        position = 0 to -1
        rotation = 10
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -3 to -2
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 0 to -5
        rotation = 3
    }
    io(INPUT) {
        index = 3
        position = -3 to -1
        rotation = 1
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 1 to -1, 0 to -1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                forward()
                forward()
                reset()
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                reset()
                wait(4)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                forward()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
