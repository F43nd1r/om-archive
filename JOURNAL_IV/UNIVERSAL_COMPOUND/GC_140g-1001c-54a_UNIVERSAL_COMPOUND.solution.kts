
solution {
    puzzle = "P072"
    name = "B GC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to -2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -4
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 3 to -5
        rotation = -3
    }
    glyph(UNIFICATION) {
        position = -1 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    track {
        position = 1 to -5
        positions = listOf(0 to 0, -1 to 1, -1 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
                wait(13)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(45)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(25)
                rotateClockwise()
                rotateClockwise()
                wait(71)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                rotateCounterClockwise()
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
                rotateCounterClockwise()
                back()
                reset()
                wait(1)
                grab()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
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
                rotateClockwise()
                reset()
                wait(3)
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
                back()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                back()
                rotateClockwise()
                forward()
                reset()
                wait(1)
                grab()
                back()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
                pivotClockwise()
                back()
                reset()
                wait(1)
                grab()
                back()
                rotateClockwise()
                forward()
                reset()
                wait(1)
                grab()
                back()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
                pivotClockwise()
                back()
                reset()
                wait(1)
                grab()
                back()
                rotateClockwise()
                forward()
                reset()
                wait(1)
                grab()
                back()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
