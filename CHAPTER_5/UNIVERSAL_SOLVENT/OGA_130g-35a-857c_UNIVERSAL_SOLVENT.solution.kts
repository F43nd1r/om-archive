
solution {
    puzzle = "P043"
    name = "OGA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 1 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 2
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = -1 to 2
        rotation = 2
    }
    glyph(ANIMISMUS) {
        position = -4 to 4
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 11
    }
    io(INPUT) {
        index = 4
        position = -1 to 2
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(11)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(37)
                rotateCounterClockwise()
                wait(6)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(9)
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
