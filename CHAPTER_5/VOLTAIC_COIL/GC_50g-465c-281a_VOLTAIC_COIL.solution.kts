
solution {
    puzzle = "P039"
    name = "B GC 6T"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 6
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 1
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                repeat()
                wait(77)
                repeat()
                wait(77)
                repeat()
                wait(77)
                repeat()
                wait(77)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
