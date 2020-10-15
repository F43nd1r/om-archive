
solution {
    puzzle = "P072"
    name = "B GAX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to -1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -3
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 5 to -4
        rotation = -3
    }
    glyph(UNIFICATION) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = -1
    }
    track {
        position = 3 to -4
        positions = listOf(0 to 0, -1 to 1, -1 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(3)
                rotateClockwise()
                wait(14)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(49)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(23)
                rotateClockwise()
                rotateClockwise()
                wait(101)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                back()
                back()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                reset()
                wait(3)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                forward()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                back()
                forward()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                forward()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                grab()
                back()
                back()
                drop()
                back()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                pivotCounterClockwise()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                reset()
            }
        }
        )
    }
}
