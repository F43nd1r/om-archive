
solution {
    puzzle = "P043"
    name = "B GC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 3 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -2
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to -1
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 0 to -1
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 2 to -3
        rotation = 0
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(17)
                rotateClockwise()
                wait(56)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(35)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                back()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
